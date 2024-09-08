import java.util.HashMap;

public class Instrument{
	private String serialNumber ;
	private double price ;
	private InstrumentSpecifications instrumentSpecs ;
	public Instrument(String serialNumber, double price){
		this.serialNumber = serialNumber ;
		this.price = price ;
	}

	public String getSerialNumber(){
		return this.serialNumber ;
	}

	public InstrumentSpecifications getSpecs(){
		return this.instrumentSpecs ;
	}

	public static Instrument createGuitar(String serialNumber, double price, Enums.InsBuilder insBuilder , Enums.Model model, Enums.Type type,
		Enums.Wood backWood, Enums.Wood topWood , Enums.NoOfStrings noOfStrings){
		Instrument Guitar = new Instrument(serialNumber , price ) ;
		Guitar.instrumentSpecs = InstrumentSpecifications.builder()
			.instrumentType(Enums.InstrumentType.Guitar)
			.insBuilder(insBuilder) 
			.type(type)
			.model(model)
			.topWood(topWood)
			.backWood(backWood)
			.noOfStrings(noOfStrings) ;

		return Guitar ;
	}

	public static Instrument createGuitar(String serialNumber, double price, Enums.InsBuilder insBuilder , Enums.Model model, Enums.Type type,
		Enums.Wood backWood, Enums.Wood topWood ){
		Instrument Guitar = new Instrument(serialNumber , price ) ;
		Guitar.instrumentSpecs = InstrumentSpecifications.builder()
			.instrumentType(Enums.InstrumentType.Guitar)
			.insBuilder(insBuilder) 
			.type(type)
			.model(model)
			.topWood(topWood)
			.backWood(backWood)
			.noOfStrings(Enums.NoOfStrings.Six) ;

		return Guitar ;
	}

	public static Instrument createMandolin(String serialNumber, double price, Enums.InsBuilder insBuilder , Enums.Model model, Enums.Type type,
		Enums.Wood backWood, Enums.Wood topWood , Enums.Style style){
		Instrument Mandolin = new Instrument(serialNumber , price ) ;
		Mandolin.instrumentSpecs = InstrumentSpecifications.builder()
			.instrumentType(Enums.InstrumentType.Mandolin)
			.insBuilder(insBuilder) 
			.type(type)
			.model(model)
			.topWood(topWood)
			.backWood(backWood)
			.style(style) ;

		return Mandolin ;
	}

	public String toString(){
		return String.format("%4s , %f , %12s "  , this.getSerialNumber() ,  
		this.price , 
		this.instrumentSpecs.getInstrumentType())  ;
	}
}  