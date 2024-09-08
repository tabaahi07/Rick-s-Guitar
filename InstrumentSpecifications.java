import java.util.HashMap;

public class InstrumentSpecifications{
	private final Enums.InstrumentType instrumentType ;
	private HashMap<Enums, String> map = new HashMap<>() ;

	public InstrumentSpecifications(Enums.InstrumentType instrumentType ,  HashMap<Enums, String>  specs){
		this.instrumentType = instrumentType ;
		this.map = specs ;
	}

	public Enums.InstrumentType getInstrumentType(){
		return this.instrumentType ;
	}
	public HashMap<Enums, String> getInstrumentSpecs(){
		return this.map ;
	}
	public Boolean matches(InstrumentSpecifications other){
		for (HashMap.Entry<Enums, String> entry : other.map.entrySet()){
			if (this.map.containsKey(entry.getKey()) && this.map.get(entry.getKey()) == entry.getValue()) return true ;
		}
		return false ;
	}
}  

