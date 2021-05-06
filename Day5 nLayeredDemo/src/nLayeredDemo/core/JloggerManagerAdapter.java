package nLayeredDemo.core;

import nLayeredDemo.jLogger.JloggerManager;
//baþka bir projeyi projemize enjekte edebilmemiz için adaptasyon yapýyoruz
public class JloggerManagerAdapter implements LoggerService{

	@Override
	public void logToSystem(String message) {
		JloggerManager manager = new JloggerManager();
		manager.log(message);
	}

}
