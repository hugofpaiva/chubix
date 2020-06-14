public abstract class Type {
	protected final String name;
	
	protected Type(String name) {
		assert name != null;
		this.name = name;
	}

	public String name() {
		return name;
	}

	public boolean conformsTo(Type other) {
		return name.equals(other.name());
	}

	public boolean isNumeric() {
		return false;
	}
	
	public boolean isDimensional() {
		return false;
	}

	public boolean isFunction() {
		return false;
	}

	@Override
	public String toString() {
		return name;
	}

	public String getJavaType(){
		return this.name;
	}
}
