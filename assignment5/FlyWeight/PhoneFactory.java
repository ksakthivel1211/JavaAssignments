package FlyWeight;

import java.util.HashMap;

class PhoneFactory{
    static HashMap<String, Phone> Phones = new HashMap<>();
    
    public static Phone getPhone(String phone) {
    	
    	Phone phoneObject=null;
    	
    	if (Phones.containsKey(phone))
    		phoneObject = Phones.get(phone);
		    else{
		        switch(phone){
		        case "Samsung":
		            System.out.println("Samsung phone created");
		            phoneObject = new Samsung();
		            break;
		        case "Apple":
		            System.out.println("Apple phone created");
		            phoneObject = new Apple();
		            break;
		        default :
		            System.out.println("No such Phone");
		        }
		        Phones.put(phone, phoneObject);
		    }	
		return phoneObject;
    }
}