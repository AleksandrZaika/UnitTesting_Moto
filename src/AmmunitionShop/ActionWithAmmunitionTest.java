package AmmunitionShop;

import Ammunition.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ActionWithAmmunitionTest {

    @org.junit.jupiter.api.Test
    void getEmptyShop() {
        Shop shop = new Shop(new ArrayList<MotorcycleHelmet>(),
                new ArrayList<MotorcycleGloves>(),
                new ArrayList<MotorcycleJacket>(),
                new ArrayList<MotorcycleTrousers>(),
                new ArrayList<MotorcycleBoots>());
        ActionWithAmmunition actions = new ActionWithAmmunition(shop);
        assertEquals(shop, actions.getShop());
    }

    @org.junit.jupiter.api.Test
    void getNotEmptyShop() {
        List<MotorcycleHelmet> motorcycleHelmetList = new ArrayList<MotorcycleHelmet>();
        List<MotorcycleGloves> motorcycleGlovesList = new ArrayList<MotorcycleGloves>();
        List<MotorcycleJacket> motorcycleJacketList = new ArrayList<MotorcycleJacket>();
        List<MotorcycleTrousers> motorcycleTrousersList = new ArrayList<MotorcycleTrousers>();
        List<MotorcycleBoots> motorcycleBootsList = new ArrayList<MotorcycleBoots>();

        motorcycleBootsList.add(new MotorcycleBoots("qewr", "unfgn",
                10.1, 1.4, 42, "our", "blue"));
        motorcycleGlovesList.add(new MotorcycleGloves("name", "manufacturer",
                12.4, 5.4, "Size", "Material"));
        motorcycleHelmetList.add(new MotorcycleHelmet("name", "manufacturer",
                116.9, 12.4, "Material", "material"));
        motorcycleJacketList.add(new MotorcycleJacket("name", "manufacturer",
                12.7, 5.4, "Size", "color", "Material"));
        motorcycleTrousersList.add(new MotorcycleTrousers("name","manufacturer",
                45.6, 1.4, "Size", "color", "Material"));
        Shop shop = new Shop(motorcycleHelmetList, motorcycleGlovesList, motorcycleJacketList,
                motorcycleTrousersList, motorcycleBootsList);
        ActionWithAmmunition actions = new ActionWithAmmunition(shop);
        assertEquals(shop, actions.getShop());
    }

    @org.junit.jupiter.api.Test
    void setShop() {
        Shop shop = new Shop(new ArrayList<MotorcycleHelmet>(),
                new ArrayList<MotorcycleGloves>(),
                new ArrayList<MotorcycleJacket>(),
                new ArrayList<MotorcycleTrousers>(),
                new ArrayList<MotorcycleBoots>());
        ActionWithAmmunition actions = new ActionWithAmmunition(shop);

        List<MotorcycleHelmet> motorcycleHelmetList = new ArrayList<MotorcycleHelmet>();
        List<MotorcycleGloves> motorcycleGlovesList = new ArrayList<MotorcycleGloves>();
        List<MotorcycleJacket> motorcycleJacketList = new ArrayList<MotorcycleJacket>();
        List<MotorcycleTrousers> motorcycleTrousersList = new ArrayList<MotorcycleTrousers>();
        List<MotorcycleBoots> motorcycleBootsList = new ArrayList<MotorcycleBoots>();

        motorcycleBootsList.add(new MotorcycleBoots("qewr", "unfgn",
                10.1, 1.4, 42, "our", "blue"));
        motorcycleGlovesList.add(new MotorcycleGloves("name", "manufacturer",
                12.4, 5.4, "Size", "Material"));
        motorcycleHelmetList.add(new MotorcycleHelmet("name", "manufacturer",
                116.9, 12.4, "Material", "material"));
        motorcycleJacketList.add(new MotorcycleJacket("name", "manufacturer",
                12.7, 5.4, "Size", "color", "Material"));
        motorcycleTrousersList.add(new MotorcycleTrousers("name","manufacturer",
                45.6, 1.4, "Size", "color", "Material"));
        Shop shop2 = new Shop(motorcycleHelmetList, motorcycleGlovesList, motorcycleJacketList,
                motorcycleTrousersList, motorcycleBootsList);

        actions.setShop(shop2);
        assertEquals(shop2, actions.getShop());
    }

    @org.junit.jupiter.api.Test
    void showItemsInfo() {
    }

    @org.junit.jupiter.api.Test
    void isAmmunitionListNotEmpty() {
    }

    @org.junit.jupiter.api.Test
    void inputIndexValue() {
    }

    @org.junit.jupiter.api.Test
    void isInputIndexValidationTrue() {
    }

    @org.junit.jupiter.api.Test
    void parseValue() {
    }

    @org.junit.jupiter.api.Test
    void inputYesNoValue() {
    }

    @org.junit.jupiter.api.Test
    void isYesNoValidationTrue() {
    }

    @org.junit.jupiter.api.Test
    void isInputIndexNumberBeInRangeListSize() {
    }

    @org.junit.jupiter.api.Test
    void isDenial() {
    }

    @org.junit.jupiter.api.Test
    void isYesOrNo() {
    }

    @org.junit.jupiter.api.Test
    void selectAmmunition() {
    }

    @org.junit.jupiter.api.Test
    void sortByWeight() {
    }

    @org.junit.jupiter.api.Test
    void inputMaxMinValue() {
    }

    @org.junit.jupiter.api.Test
    void isMaxMinValidationTrue() {
    }

    @org.junit.jupiter.api.Test
    void findAndShowItemsInRangePrice() {
    }
}