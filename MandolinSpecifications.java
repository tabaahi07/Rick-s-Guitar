public class MandolinSpecifications extends InstrumentSpecifications{
	private Enums.Builder builder ;
	private Enums.Model model ;
	private Enums.Type type ;
	private Enums.Style style ;
	private Enums.Wood topWood , backWood ;

	public MandolinSpecifications(Enums.Builder builder , Enums.Model model , Enums.Type type , Enums.Style style , Enums.Wood topWood , Enums.Wood backWood){
		this.builder = builder ;
		this.model = model ;
		this.type = type ;
		this.style = style ;
		this.topWood = topWood ;
		this.backWood = backWood ;
	}

	public Enums.Builder getBuilder(){
		return this.builder ;
	}
	public Enums.Model getModel(){
		return this.model ;
	}
	public Enums.Type getType(){
		return this.type ;
	}
	public Enums.Style getStyle(){
		return this.style ;
	} 

	public Enums.Wood getBackWood() {
		return backWood;
	}
	public Enums.Wood getTopWood() {
		return topWood;
	}
	public Boolean matches(MandolinSpecifications other){
		return ((this.builder == other.builder) || (this.model == other.model) || (this.type == other.type) || (this.topWood == other.topWood) || (this.backWood == other.backWood) || (this.style == other.style)) ;
	}
} 