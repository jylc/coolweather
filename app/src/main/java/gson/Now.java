package gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wxb on 2018/3/17.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More moew;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
