package android.coolweather.com.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Michael on 2017/12/27.
 */

public class County extends DataSupport {
    private int id;
    private String countyName;
    private int weatherId;
    private int cityId;

    public int getId(){
        return id;
    }

    public void setId(){
        this.id = id;
    }

    public String getCountyName(){
        return countyName;
    }

    public void setCountyName(String countyName){
        this.countyName = countyName;
    }

    public int getWeatherId(){
        return weatherId;
    }

    public void setCityId(int weatherId){
        this.weatherId = weatherId;
    }
}
