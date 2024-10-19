package object;

import java.util.Objects;

public class ObjectEx {
	private String name;

	public ObjectEx(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "ObjectEx [name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null && getClass() != obj.getClass()) return false;
		
		ObjectEx other = (ObjectEx) obj;
		return Objects.equals(name, other.name);
	}
	
	
}
