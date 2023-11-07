package utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

import com.app.core.Student;

public interface IOUtils {
	
	static void storeStudentDetails(Map<String,Student> mp,String fname){
		try(ObjectOutputStream in = new ObjectOutputStream(new FileOutputStream(fname))){
			in.writeObject(mp);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("unchecked")
	static Map<String,Student> readStudentDeatils(String fname) {
		try(ObjectInputStream out = new ObjectInputStream(new FileInputStream(fname))){
			return (Map<String,Student>)out.readObject();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new HashMap<>();
		}
	}
}
