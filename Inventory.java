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

	public ArrayList<Instrument> search(InstrumentSpecifications searchInstrumentSpecs) {
		ArrayList<Instrument> customerChoiceInstrumentList = new ArrayList<Instrument>() ;
		for (Iterator i = instrumentList.iterator(); i.hasNext(); ) {
			Instrument instrument = (Instrument)i.next() ;
			if(instrument.getSpecs().matches(searchInstrumentSpecs)) customerChoiceInstrumentList.add(instrument) ;	
		} 
		return customerChoiceInstrumentList ;
	} 

	public static void main(String[] args){
		Inventory obj = new Inventory() ;

	    obj.addInstrument(Instrument.createGuitar("01", 500.50, Enums.InsBuilder.Fender, Enums.Model.Stratocaster, Enums.Type.Electric, Enums.Wood.Alder, Enums.Wood.Maple , Enums.NoOfStrings.Twelve));
        obj.addInstrument(Instrument.createGuitar("02", 450.75, Enums.InsBuilder.Gibson, Enums.Model.Les_Paul, Enums.Type.Electric, Enums.Wood.Mahogany, Enums.Wood.Rosewood));
        obj.addInstrument(Instrument.createGuitar("03", 300.30, Enums.InsBuilder.Ibanez, Enums.Model.RG, Enums.Type.Electric, Enums.Wood.Basswood, Enums.Wood.Maple));
        obj.addInstrument(Instrument.createGuitar("04", 750.25, Enums.InsBuilder.PRS, Enums.Model.Custom_24, Enums.Type.Electric, Enums.Wood.Mahogany, Enums.Wood.Maple));
        obj.addInstrument(Instrument.createGuitar("05", 600.00, Enums.InsBuilder.Yamaha, Enums.Model.Pacifica, Enums.Type.Electric, Enums.Wood.Alder, Enums.Wood.Rosewood));
        obj.addInstrument(Instrument.createGuitar("06", 550.10, Enums.InsBuilder.Fender, Enums.Model.Telecaster, Enums.Type.Electric, Enums.Wood.Ash, Enums.Wood.Maple , Enums.NoOfStrings.Twelve));
        obj.addInstrument(Instrument.createGuitar("07", 475.25, Enums.InsBuilder.Gibson, Enums.Model.SG, Enums.Type.Electric, Enums.Wood.Mahogany, Enums.Wood.Ebony));
        obj.addInstrument(Instrument.createGuitar("08", 625.50, Enums.InsBuilder.Epiphone, Enums.Model.Les_Paul, Enums.Type.Electric, Enums.Wood.Mahogany, Enums.Wood.Maple));
        obj.addInstrument(Instrument.createGuitar("09", 700.40, Enums.InsBuilder.ESP, Enums.Model.LTD, Enums.Type.Electric, Enums.Wood.Basswood, Enums.Wood.Rosewood));
        obj.addInstrument(Instrument.createGuitar("10", 525.00, Enums.InsBuilder.Jackson, Enums.Model.Dinky, Enums.Type.Electric, Enums.Wood.Alder, Enums.Wood.Maple));
        obj.addInstrument(Instrument.createGuitar("11", 650.80, Enums.InsBuilder.Charvel, Enums.Model.Pro_Mod, Enums.Type.Electric, Enums.Wood.Ash, Enums.Wood.Maple));
        obj.addInstrument(Instrument.createGuitar("12", 575.20, Enums.InsBuilder.Ibanez, Enums.Model.JEM, Enums.Type.Electric, Enums.Wood.Basswood, Enums.Wood.Maple , Enums.NoOfStrings.Twelve));
        obj.addInstrument(Instrument.createGuitar("13", 720.90, Enums.InsBuilder.Gibson, Enums.Model.Explorer, Enums.Type.Electric, Enums.Wood.Mahogany, Enums.Wood.Rosewood));
        obj.addInstrument(Instrument.createGuitar("14", 485.75, Enums.InsBuilder.Schecter, Enums.Model.Hellraiser, Enums.Type.Electric, Enums.Wood.Mahogany, Enums.Wood.Maple));
        obj.addInstrument(Instrument.createGuitar("15", 510.60, Enums.InsBuilder.Fender, Enums.Model.Mustang, Enums.Type.Electric, Enums.Wood.Alder, Enums.Wood.Maple));

        obj.addInstrument(Instrument.createMandolin("14", 485.75, Enums.InsBuilder.Schecter, Enums.Model.Hellraiser, Enums.Type.Electric, Enums.Wood.Mahogany, Enums.Wood.Maple , Enums.Style.A));
        obj.addInstrument(Instrument.createMandolin("15", 510.60, Enums.InsBuilder.Fender, Enums.Model.Mustang, Enums.Type.Electric, Enums.Wood.Alder, Enums.Wood.Maple,Enums.Style.F));

  		
		InstrumentSpecifications CutuIdealInstrumentSpecs = InstrumentSpecifications.builder()
			.instrumentType(Enums.InstrumentType.Mandolin) ;


		ArrayList<Instrument> idealInstrumentList = obj.search(CutuIdealInstrumentSpecs) ;
		if(idealInstrumentList.isEmpty()) System.out.println("No instrument found") ;
		else{
			for (Iterator i = idealInstrumentList.iterator(); i.hasNext(); ) {
				Instrument instrument = (Instrument)i.next() ;
				System.out.println(instrument) ;
			}
		}
	} 
	
}