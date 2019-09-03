package fwb.callableEx;

import jdk.nashorn.internal.codegen.CompilerConstants;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

class MyThread implements Callable<String>{
    private int ticket = 10;
    @Override
    public String call() {
        for (int i = 0;i < 10;i++){
            System.out.println("还剩下" + ticket-- + "票");
        }
        return "票卖完了，客官明天见";
    }
}

public class CallableEx {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<String> callable = new MyThread();
        FutureTask<String> futureTask = new FutureTask<>(callable);
        Thread thread = new Thread(futureTask);
        thread.start();
        System.out.println(futureTask.get());

    }
}
