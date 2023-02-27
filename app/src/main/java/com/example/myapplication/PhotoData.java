package com.example.myapplication;

import java.util.ArrayList;

public class PhotoData {
    public static ArrayList<Photo> generatePhoto(){
        ArrayList<Photo> photos = new ArrayList<>();
        photos.add(new Photo(0, "https://upload.wikimedia.org/wikipedia/commons/thumb/4/47/",
                "Watermelon","The watermelon is an annual that has a prostrate or climbing habit. Stems are up to 3 metres (10 feet) long and new growth has yellow or brown hairs. " +
                "Leaves are 60 to 200 millimetres (2+1⁄4 to 7+3⁄4 inches) long and 40 to 150 mm (1+1⁄2 to 6 in) wide. These usually have three lobes that are lobed or doubly lobed. " +
                "Young growth is densely woolly with yellowish-brown hairs which disappear as the plant ages. Like all but one species in the genus Citrullus, watermelon has branching tendrils. " +
                "Plants have unisexual male or female flowers that are white or yellow and borne on 40-millimetre-long (1+1⁄2 in) hairy stalks. Each flower grows singly in the leaf axils, " +
                "and the species' sexual system, with male and female flowers produced on each plant, is (monoecious). The male flowers predominate at the beginning of the season; the female flowers," +
                "which develop later, have inferior ovaries. The styles are united into a single column."));
        photos.add(new Photo(1, "https://en.wikipedia.org/wiki/Strawberry#/media/File:Garden_strawberry_(Fragaria_%C3%97_ananassa)_single2.jpg", "Strawberry", "The first garden strawberry was grown in Brittany, France, during the late 18th century.[3] Prior to this, wild strawberries and cultivated selections from wild strawberry species were the common source of the fruit."));
        photos.add(new Photo(2, "https://en.wikipedia.org/wiki/Cranberry#/media/File:Cranberries20101210.jpg","Canberry", ""));
        photos.add(new Photo(3, "https://en.wikipedia.org/wiki/Grape#/media/File:Abhar-iran.JPG", "Grape",""));
        photos.add(new Photo(4, "https://en.wikipedia.org/wiki/Banana#/media/File:Bananas_white_background_DS.jpg","Banana",""));
        return photos;
    }

    public static Photo getPhotoFromId(int id){
        ArrayList<Photo> phs = generatePhoto();
        for(int i=0;i<phs.size();i++){
            if(phs.get(i).getId() == id){
                return phs.get(i);
            }
        }
        return null;
    }

}
