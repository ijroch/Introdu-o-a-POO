package util;

public class Television {
	boolean status; 
	int volume;
	int volMax=10, volMin=0;
	int channel;
	int channelMax=99, channelMin=0;
	boolean silence;
	
	
    public Int getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public Int getChannel() {
        return channel;
    }

    public void setChannell(Integer canal) {
        this.channel = channel;
    }
    
    public void increaseVolume(){
        Int volume = this.getVolume();
        if(volume < volMax){
           volume++;
           this.setVolume(volume);
        }else{
            System.out.println("Volume já está no máximo");
        } 
    }
        
     public void decreaseVolume(){
    	 int volume = this.getVolume();
         if(volume > volMin){
             volume--;
             this.setVolume(volume);
         }else{
        	 System.out.println("Volume já está no mínimo");
            } 
        }
        
     public void channelUp(){
         int channel =this.channel;
         
        }
        
     public void channelDown(){
            
        }
}
