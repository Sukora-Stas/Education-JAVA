package UniversityStudy.src.OS.lab_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.util.Vector;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Process p = Runtime.getRuntime().exec("pstree ${pid}");
        System.out.println(getPid());
        System.out.println(getPidOfProcess(p));
    }

    public static String getPid() throws IOException,InterruptedException {

        Vector<String> commands=new Vector<String>();
        commands.add("/bin/bash");
        commands.add("-c");
        commands.add("echo $PPID");
        ProcessBuilder pb=new ProcessBuilder(commands);

        Process pr=pb.start();
        pr.waitFor();
        if (pr.exitValue()==0) {
            BufferedReader outReader=new BufferedReader(new InputStreamReader(pr.getInputStream()));
            return outReader.readLine().trim();
        } else {
            System.out.println("Error while getting PID");
            return "";
        }
    }

    public static long getPidOfProcess(Process p) {
        long pid = -1;

        try {
            if (p.getClass().getName().equals("java.lang.UNIXProcess")) {
                Field f = p.getClass().getDeclaredField("pid");
                f.setAccessible(true);
                pid = f.getLong(p);
                f.setAccessible(false);
            }
        } catch (Exception e) {
            pid = -1;
        }
        return pid;
    }
}
