package onetwothree;
public enum EnumLogger {

    INSTANCE;
  
    @Override
    public String toString() {
      return getDeclaringClass().getCanonicalName() + "@" + hashCode();
    }
  }