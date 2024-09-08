import java.util.HashMap;

public class Instrument{
	private String serialNumber ;
	private double price ;
	private InstrumentSpecifications instrumentSpecs ;
	public Instrument(String serialNumber, double price){
		this.serialNumber = serialNumber ;
		this.price = price ;
	}
	public static Instrument createGuitar(String serialNumber, double price, Enums.InsBuilder insBuilder , Enums.Model model, Enums.Type type,
		Enums.Wood backWood, Enums.Wood topWood , Enums.NoOfStrings noOfStrings){
		Instrument Guitar = new Instrument(serialNumber , price ) ;
		Guitar.instrumentSpecs = InstrumentSpecifications.builder().insBuilder(insBuilder) 
	}
}