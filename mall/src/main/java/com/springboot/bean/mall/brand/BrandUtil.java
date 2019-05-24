package com.springboot.bean.mall.brand;

import java.math.BigDecimal;

public class BrandUtil {
    public static Brand transfer(String s){
        Brand brand = new Brand();
        String[] split = s.split(",");
        for (int i = 0; i < split.length; i++) {
            String[] split1 = split[i].split(":");
            if(i==0){
            brand.setId(Integer.parseInt(split1[1]));
            }
            if(i==1){
            brand.setName(split1[1].replace("\"",""));
            }
            if(i==2){
                brand.setDesc(split1[1].replace("\"",""));
            }
            if(i==3){
                int index = split[i].indexOf(":");
                String substring = split[i].substring(index+1);
                brand.setPicUrl(substring.replace("\"",""));
            }
            if(i==4){
                brand.setSortOrder(Short.parseShort(split1[1]));
            }
            if(i==5){
                brand.setFloorPrice(split1[1].replace("\"",""));
            }
            if(i==6){
                brand.setAddTime(split1[1].replace("\"",""));
            }
            if(i==7){
                brand.setUpdateTime(split1[1].replace("\"",""));
            }
            if(i==8){
                brand.setDeleted(Boolean.valueOf(split1[1]));
            }
        }
        return brand;
    }

    public static Brand transfer2(String s){
        Brand brand = new Brand();
        s = s.replace("}","").replace("{","");
        String[] split = s.split(",");
        for (int i = 0; i < split.length; i++) {
            String[] split1 = split[i].split(":");
            if(i==0){
                brand.setName(split1[1].replace("\"",""));
            }
            if(i==1){
                brand.setDesc(split1[1].replace("\"",""));
            }
            if(i==2){
                brand.setFloorPrice(split1[1].replace("\"",""));
            }
            if(i==3){
                brand.setPicUrl(split1[1].replace("\"",""));
            }
        }
        return brand;

    }

}
