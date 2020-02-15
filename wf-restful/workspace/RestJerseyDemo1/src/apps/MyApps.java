package apps;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import com.demo.test.Concat;

public class MyApps extends Application {
	
	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> entries = new HashSet<>();
		entries.add(Concat.class);
		return entries;
	}
}
