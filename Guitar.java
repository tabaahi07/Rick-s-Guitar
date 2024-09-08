public class Guitar extends Instrument {
	private GuitarSpecifications specs ;

	public Guitar(String serialNumber, double price,
		Enums.Builder builder , Enums.Model model, Enums.Type type,
		Enums.Wood backWood, Enums.Wood topWood , Enums.NoOfStrings noOfStrings) {
		super(serialNumber , price) ;
		this.specs = new GuitarSpecifications(builder , model , type , backWood , topWood , noOfStrings) ;
	}
	
	public GuitarSpecifications getSpecs(){
		return specs ;
	}
	
	public String toString(){
		return String.format("%4s , %f , %12s , %12s , %12s , %12s , %12s , %6s"  , this.getSerialNumber() ,  
		this.getPrice() ,
		this.specs.getBuilder() ,
		this.specs.getModel() ,
		this.specs.getType() ,
		this.specs.getBackWood()  , 
		this.specs.getTopWood() , 
		this.specs.getNoOfStrings()) ;
	}
} 