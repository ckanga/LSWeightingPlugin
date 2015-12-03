package lsweightingplugin;

import studentlottery.database.Attribute;
import studentlottery.database.StudentList;
import studentlottery.plugin.IPlugin;
import studentlottery.server.Server;

public class Main implements IPlugin {

	@Override
	public String getName() {
		return "LSWeighting";
	}

	@Override
	public String getVersion() {
		return "0a";
	}

	@Override
	public <T> void eventOccured(String eventName, Attribute<T> a, Server server) {
		if(eventName.equals("selectableStudentsPopulated")) {
			StudentList students = (StudentList) server.getAttribute("Students").getAttribute();
		}
	}

}
