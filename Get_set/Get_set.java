package Get_set;

public class Get_set {
    String title;
    private String season;
    private String site;

    public Get_set(String title,String season,String site){
       this.title=title;
       this.setseason(season);
       this.setsite(site);
    }

    public void setseason(String season){
        if(season.equals("1") || season.equals("2"))
        {
            this.season=season;
        }
        else{
            this.season="put a valid season number";
        }
        
        }

         
        public String getseason(){
            return this.season;
        }


          
        public void setsite(String site){
            if(site.equals("zoro")||site.equals("gogo")||site.equals("anime pahe"))
            {
                this.site=site;
            }
            else{
                this.site=("i dont't know this site");
            }
        }


        public String getsite(){
            return this.site;
        }
       
        
    }
    

