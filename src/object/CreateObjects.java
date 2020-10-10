package object;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class CreateObjects {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		// TODO Auto-generated method stub
		Create o1 = new Create();
		System.out.println(o1 + " ; hash code" + o1.hashCode());
		
		Class obj = null;
		try {
			obj = Class.forName("object.Create");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Method[] meth = obj.getMethods();
		Field[] field = obj.getFields();
		Field f = obj.getDeclaredField("privateField");
		f.setAccessible(true);
		Create create = new Create();
		System.out.println(f.get(create ) );
		Class method = obj.getComponentType();
//		for(Method met : meth) {
//			System.out.println(met.getName() + " modifiers is : " + Modifier.toString(met.getModifiers()) + " fields are : " + met.getReturnType());
//		}
		
//		for(Field f : field) {
//			System.out.println(f.getName() + f.getType().getName().toString()+" modifiers is : " + Modifier.toString(f.getModifiers()));
//		}
	}

}
