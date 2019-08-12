package com.digital.honed.examendespegar.Helpers;

import com.digital.honed.examendespegar.R;

public class StarRating {

    public static int getStarImage(int starId){
        switch (starId){
            case 1:
                return R.drawable.onestars;
            case 2:
                return R.drawable.twostars;
            case 3:
                return R.drawable.threestars;
            case 4:
                return R.drawable.fourstars;
            case 5:
                return R.drawable.fivestars;
        }
        return 1;
    }
}
