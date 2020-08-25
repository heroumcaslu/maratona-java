package com.devdojo.concorrencia.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduleThreadPoolTest {

	private static final ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
	
	private static void beep() {
		
		//scheduledExecutorService.schedule(Runnable, 24, TimeUnit.HOURS);
		final Runnable beeper = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println(new SimpleDateFormat("HH:mm:ss").format(new Date())+" beep");
				try {
					TimeUnit.SECONDS.sleep(6);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		};
		//espera os 6 segundos do sleep e já executa a tarefa
		//scheduledExecutorService.scheduleAtFixedRate(beeper, 1, 5, TimeUnit.SECONDS);
		//espera os 6 segundos e executa o delay pra depois executar a tarefa
		ScheduledFuture<?> scheduleFuture = scheduledExecutorService.scheduleWithFixedDelay(beeper, 1, 5, TimeUnit.SECONDS);
		
		scheduledExecutorService.schedule(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Cancelando");
				scheduleFuture.cancel(false);
				scheduledExecutorService.shutdown();
				
			}
		}, 10, TimeUnit.SECONDS);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		beep();

	}

}
