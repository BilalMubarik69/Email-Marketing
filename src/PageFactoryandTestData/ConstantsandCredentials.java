package PageFactoryandTestData;

import java.util.Hashtable;

public class ConstantsandCredentials {

public Hashtable<String, String> GetUserInfo(){
		
		Hashtable<String,String> userdata=new Hashtable<String,String>();
		
		userdata.put("EMS_Regular_User", "125748_OrdersRegression2_test1234");
		userdata.put("EMS_AIA_User_StageUAT", "109480_bilalcorps_bilal1234");
		
		
		return userdata;
	}


}
