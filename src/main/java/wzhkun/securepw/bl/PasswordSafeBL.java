package wzhkun.securepw.bl;

import java.io.IOException;
import java.util.Set;

import wzhkun.securepw.core.PasswordItem;
import wzhkun.securepw.core.PasswordSafe;

public class PasswordSafeBL {
	private PasswordSafe safe;
	
	public void setPasswordSafe(PasswordSafe safe){
		this.safe=safe;
	}
	
	public PasswordSafe getPasswordSafe(){
		return safe;
	}
	
	
	public void addPasswordItem(PasswordItem item) throws IOException{
		safe.add(item);
		safe.save();
	}
	
	public void removePasswordItem(PasswordItem item) throws IOException{
		safe.remove(item);
		safe.save();
	}
	
	public void updatePasswordItem(PasswordItem old,PasswordItem newPI) throws IOException{
		safe.remove(old);
		safe.add(newPI);
		safe.save();
	}
	
	public Set<PasswordItem> getPasswordItems(){
		return safe.allItems();
	}
}
