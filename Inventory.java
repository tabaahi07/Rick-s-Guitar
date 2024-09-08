import java.util.* ;
public class Inventory {
	
	private ArrayList<Instrument> instrumentList ;

	public Inventory() {
		this.instrumentList  = new ArrayList<Instrument>();
	}	

	public void addInstrument(Instrument instrument){
		instrumentList .add(instrument) ;
	}


	public Instrument getInstrument(String serialNumber) {
		for (Iterator i = instrumentList .iterator(); i.hasNext(); ) {
			Instrument instrument = (Instrument)i.next();
			if (instrument.getSerialNumber().equals(serialNumber)) {
				return instrument ;
			}
		} 
		return null ;
	}  

	public ArrayList<Instrument> search(GuitarSpecifications searchGuitarSpecs) {
		ArrayList<Guitar> customerChoiceGuitarList = new ArrayList<Guitar>() ;
		for (Iterator i = guitars.iterator(); i.hasNext(); ) {
			Guitar guitar = (Guitar)i.next() ;
			if(guitar.getSpecs().matches(searchGuitarSpecs)) customerChoiceGuitarList.add(guitar) ;	
		} 
		return customerChoiceGuitarList ;
	}
 
	public static void main(String[] args){
		Inventory obj = new Inventory() ;
		// Adding 15 dummy guitars

	    obj.addGuitar("01", 500.50, Enums.Builder.Fender, Enums.Model.Stratocaster, Enums.Type.Electric, Enums.Wood.Alder, Enums.Wood.Maple , Enums.NoOfStrings.Twelve);
        obj.addGuitar("02", 450.75, Enums.Builder.Gibson, Enums.Model.Les_Paul, Enums.Type.Electric, Enums.Wood.Mahogany, Enums.Wood.Rosewood);
        obj.addGuitar("03", 300.30, Enums.Builder.Ibanez, Enums.Model.RG, Enums.Type.Electric, Enums.Wood.Basswood, Enums.Wood.Maple);
        obj.addGuitar("04", 750.25, Enums.Builder.PRS, Enums.Model.Custom_24, Enums.Type.Electric, Enums.Wood.Mahogany, Enums.Wood.Maple);
        obj.addGuitar("05", 600.00, Enums.Builder.Yamaha, Enums.Model.Pacifica, Enums.Type.Electric, Enums.Wood.Alder, Enums.Wood.Rosewood);
        obj.addGuitar("06", 550.10, Enums.Builder.Fender, Enums.Model.Telecaster, Enums.Type.Electric, Enums.Wood.Ash, Enums.Wood.Maple , Enums.NoOfStrings.Twelve);
        obj.addGuitar("07", 475.25, Enums.Builder.Gibson, Enums.Model.SG, Enums.Type.Electric, Enums.Wood.Mahogany, Enums.Wood.Ebony);
        obj.addGuitar("08", 625.50, Enums.Builder.Epiphone, Enums.Model.Les_Paul, Enums.Type.Electric, Enums.Wood.Mahogany, Enums.Wood.Maple);
        obj.addGuitar("09", 700.40, Enums.Builder.ESP, Enums.Model.LTD, Enums.Type.Electric, Enums.Wood.Basswood, Enums.Wood.Rosewood);
        obj.addGuitar("10", 525.00, Enums.Builder.Jackson, Enums.Model.Dinky, Enums.Type.Electric, Enums.Wood.Alder, Enums.Wood.Maple);
        obj.addGuitar("11", 650.80, Enums.Builder.Charvel, Enums.Model.Pro_Mod, Enums.Type.Electric, Enums.Wood.Ash, Enums.Wood.Maple);
        obj.addGuitar("12", 575.20, Enums.Builder.Ibanez, Enums.Model.JEM, Enums.Type.Electric, Enums.Wood.Basswood, Enums.Wood.Maple , Enums.NoOfStrings.Twelve);
        obj.addGuitar("13", 720.90, Enums.Builder.Gibson, Enums.Model.Explorer, Enums.Type.Electric, Enums.Wood.Mahogany, Enums.Wood.Rosewood);
        obj.addGuitar("14", 485.75, Enums.Builder.Schecter, Enums.Model.Hellraiser, Enums.Type.Electric, Enums.Wood.Mahogany, Enums.Wood.Maple);
        obj.addGuitar("15", 510.60, Enums.Builder.Fender, Enums.Model.Mustang, Enums.Type.Electric, Enums.Wood.Alder, Enums.Wood.Maple);

  

		GuitarSpecifications CutuIdealGuitar = new GuitarSpecifications(Enums.Builder.Gibson , null , null , null , null , Enums.NoOfStrings.Twelve);
		ArrayList<Guitar> idealGuitarList = obj.search(CutuIdealGuitar) ;
		if(idealGuitarList.isEmpty()) System.out.println("No guitar found") ;
		else{
			for (Iterator i = idealGuitarList.iterator(); i.hasNext(); ) {
				Guitar guitar = (Guitar)i.next() ;
				System.out.println(guitar) ;
			}
		}
	}  
	
}