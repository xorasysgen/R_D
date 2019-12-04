package com.skbh.impl.InterView.pattern.builder;
//The Abstract Factory Pattern consists of 
//an AbstractFactory, ConcreteFactory, AbstractProduct, ConcreteProduct and Client.
/*
 * AF - CF
 * AP - CP 
 * C 
 *
 */

//Abstract factory
interface ComputerAbstractFactory {
	public Computer createComputer();

}


//ConcreteFactory
class PCFactory implements ComputerAbstractFactory {

	private String ram;
	private String hdd;
	private String cpu;
	
	public PCFactory(String ram, String hdd, String cpu){
		this.ram=ram;
		this.hdd=hdd;
		this.cpu=cpu;
	}
	@Override
	public Computer createComputer() {
		return new PC(ram,hdd,cpu);
	}

}

//ConcreteFactory
class ServerFactory implements ComputerAbstractFactory {

	private String ram;
	private String hdd;
	private String cpu;
	
	public ServerFactory(String ram, String hdd, String cpu){
		this.ram=ram;
		this.hdd=hdd;
		this.cpu=cpu;
	}
	
	@Override
	public Computer createComputer() {
		return new Server(ram,hdd,cpu);
	}

}
//ConcreteFactory
class MobileServerFactory implements ComputerAbstractFactory {

	private String ram;
	private String hdd;
	private String cpu;
	
	public MobileServerFactory(String ram, String hdd, String cpu){
		this.ram=ram;
		this.hdd=hdd;
		this.cpu=cpu;
	}
	
	@Override
	public Computer createComputer() {
		return new Mobile(ram,hdd,cpu);
	}

}

//Abstract Product
abstract class Computer {
    
    public abstract String getRAM();
    public abstract String getHDD();
    public abstract String getCPU();
     
    @Override
    public String toString(){
        return "RAM= "+this.getRAM()+", HDD="+this.getHDD()+", CPU="+this.getCPU();
    }
}

//ConcreteProduct
class PC extends Computer {
	 
    private String ram;
    private String hdd;
    private String cpu;
     
    public PC(String ram, String hdd, String cpu){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }
    @Override
    public String getRAM() {
        return this.ram;
    }
 
    @Override
    public String getHDD() {
        return this.hdd;
    }
 
    @Override
    public String getCPU() {
        return this.cpu;
    }
 
}

//ConcreteProduct
class Server extends Computer {
	 
    private String ram;
    private String hdd;
    private String cpu;
     
    public Server(String ram, String hdd, String cpu){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }
    @Override
    public String getRAM() {
        return this.ram;
    }
 
    @Override
    public String getHDD() {
        return this.hdd;
    }
 
    @Override
    public String getCPU() {
        return this.cpu;
    }
 
}

//ConcreteProduct
class Mobile extends Computer {
	 
  private String ram;
  private String hdd;
  private String cpu;
   
  public Mobile(String ram, String hdd, String cpu){
      this.ram=ram;
      this.hdd=hdd;
      this.cpu=cpu;
  }
  @Override
  public String getRAM() {
      return this.ram;
  }

  @Override
  public String getHDD() {
      return this.hdd;
  }

  @Override
  public String getCPU() {
      return this.cpu;
  }

}


//client
class ComputerFactory {

	public static Computer getComputer(ComputerAbstractFactory factory){
		return factory.createComputer();
	}
}

public class FactoryPatternExample {

	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB","500 GB","2.4 GHz"));
		Computer server =ComputerFactory.getComputer(new ServerFactory("16 GB","1 TB","2.9 GHz"));
		Computer mobile =ComputerFactory.getComputer(new MobileServerFactory("32 GB","1 TB","2.9 GHz"));
		System.out.println("AbstractFactory PC Config::"+pc);
		System.out.println("AbstractFactory Server Config::"+server);
		System.out.println("AbstractFactory Server Config::"+mobile);
	}

}
