package nLayeredDemo.core;

import nLayeredDemo.jLogger.JloggerManager;
//ba�ka bir projeyi projemize enjekte edebilmemiz i�in adaptasyon yap�yoruz
public class JloggerManagerAdapter implements LoggerService{

	@Override
	public void logToSystem(String message) {
		JloggerManager manager = new JloggerManager();
		manager.log(message);
	}

}
