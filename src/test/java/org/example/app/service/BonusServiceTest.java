package org.example.app.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void testBonusServiceWithExpectedResult() {

        BonusService service = new BonusService();
        double sales = 20;

        double actualBonus= service.calcBonus(sales);

        double expectedBonus = 2;
        assertEquals(expectedBonus, actualBonus, 0.001);
    }

    @Test
    void testBonusServiceWithUnexpectedResult() {

        BonusService service = new BonusService();
        double sales = 50;

        double actualBonus = service.calcBonus(sales);

        double unexpectedBonus = 5;
        assertEquals(unexpectedBonus, actualBonus, 0.001);
    }
}