package FlyWeight;

import java.util.HashMap;

class PhoneFactory{
    static HashMap<String, Phone> Phones = new HashMap<>();
    
    public static Phone getPhone(String osType) {
    	
    	Phone phoneObject=null;
    	
    	if (Phones.containsKey(osType))
    		phoneObject = Phones.get(osType);
		    else{
		        switch(osType){
		        case "Android":
		            System.out.println("Android phone created");
		            phoneObject = new Android();
		            break;
		        case "IOS":
		            System.out.println("IOS created");
		            phoneObject = new Iphone();
		            break;
		        default :
		            System.out.println("No such OS");
		        }
		        Phones.put(osType, phoneObject);
		    }	
		return phoneObject;
    }
}