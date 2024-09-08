public class GuitarSpecifications extends InstrumentSpecifications{
	private Enums.Builder builder ;
	private Enums.Model model ;
	private Enums.Type type ;
	private Enums.Wood backWood, topWood ;
	private Enums.NoOfStrings noOfStrings ;

	public GuitarSpecifications(
		Enums.Builder builder , Enums.Model model, Enums.Type type,
		Enums.Wood backWood, Enums.Wood topWood , Enums.NoOfStrings noOfStrings) {
		
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
		this.noOfStrings = noOfStrings ;
	}
	public Enums.Builder getBuilder() {
		return builder;
	}
	public Enums.Model getModel() {
		return model;
	}
	public Enums.Type getType() {
		return type;
	}
	public Enums.Wood getBackWood() {
		return backWood;
	}
	public Enums.Wood getTopWood() {
		return topWood;
	}
	public Enums.NoOfStrings getNoOfStrings(){
		return noOfStrings ;
	}
	public Boolean matches(GuitarSpecifications other){
		return ((this.builder == other.builder) || (this.model == other.model) || (this.type == other.type) || (this.topWood == other.topWood) || (this.backWood == other.backWood) || (this.noOfStrings == other.noOfStrings)) ;
	}
} 