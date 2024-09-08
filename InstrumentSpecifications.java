import java.util.HashMap;

public class InstrumentSpecifications{
	private Enums.InstrumentType instrumentType ;
	public InstrumentSpecifications instrumentType(Enums.InstrumentType instrumentType){
		this.instrumentType = instrumentType ;
		return this ;
	}

	private Enums.InsBuilder insBuilder ;
	public InstrumentSpecifications insBuilder(Enums.InsBuilder insBuilder){
		this.insBuilder = insBuilder ; 
		return this ;
	} 

	private Enums.Model model ;
	public InstrumentSpecifications model(Enums.Model model){
		this.model = model ;
		return this ;
	}

	private Enums.Type type ;
	public InstrumentSpecifications type(Enums.Type type){
		this.type = type ;
		return this ;
	}

	private Enums.Wood backWood ;
	public InstrumentSpecifications backWood(Enums.Wood backWood){
		this.backWood = backWood ;
		return this ;
	}

	private Enums.Wood topWood ;
	public InstrumentSpecifications topWood(Enums.Wood topWood){
		this.topWood = topWood ;
		return this ;
	}

	private Enums.Style style ;
	public InstrumentSpecifications style(Enums.Style style){
		this.style = style ;
		return this ;
	}

	private Enums.NoOfStrings noOfStrings ;
	public InstrumentSpecifications noOfStrings(Enums.NoOfStrings noOfStrings){
		this.noOfStrings = noOfStrings ;
		return this ;
	}
	
	public static InstrumentSpecifications builder(){
		InstrumentSpecifications obj = new InstrumentSpecifications() ;
		return obj ;
	}

	public Enums.InstrumentType getInstrumentType(){
		return this.instrumentType ;
	}

	public Boolean matches(InstrumentSpecifications other){
		return ((other.instrumentType != null && this.instrumentType == other.instrumentType) ||
				(other.insBuilder != null && this.insBuilder == other.insBuilder) || 
				(other.model != null && this.model == other.model) || 
				(other.type != null && this.type == other.type) || 
				(other.backWood != null && this.backWood == other.backWood) ||
				(other.topWood != null && this.topWood == other.topWood) ||
				(other.noOfStrings != null && this.noOfStrings == other.noOfStrings) ||
				(other.style != null && this.style == other.style)
			) ;
	} 
} 

