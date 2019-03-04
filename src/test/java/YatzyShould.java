import org.junit.*;
import static org.junit.Assert.*;

public class YatzyShould {

    @Test
    public void score_the_sum_of_all_dices_when_chance() {
        assertEquals(15, Yatzy.chance(2,3,4,5,1));
        assertEquals(16, Yatzy.chance(3,3,4,5,1));
    }

    @Test public void score_50_when_yatzy() {
        assertEquals(50, Yatzy.yatzy(4,4,4,4,4));
        assertEquals(50, Yatzy.yatzy(6,6,6,6,6));
        assertEquals(0, Yatzy.yatzy(6,6,6,6,3));
    }

    @Test public void score_the_sum_all_ones_when_ones() {
        assertEquals(1, Yatzy.ones(1,2,3,4,5));
        assertEquals(2, Yatzy.ones(1,2,1,4,5));
        assertEquals(0, Yatzy.ones(6,2,2,4,5));
    }

    @Test
    public void score_the_sum_all_twos_when_twos() {
        assertEquals(4, Yatzy.twos(1,2,3,2,6));
        assertEquals(10, Yatzy.twos(2,2,2,2,2));
        assertEquals(0, Yatzy.twos(1,4,5,5,7));
    }

    @Test
    public void score_the_sum_all_threes_when_threes() {
        assertEquals(6, Yatzy.threes(1,2,3,2,3));
        assertEquals(12, Yatzy.threes(2,3,3,3,3));
        assertEquals(0, Yatzy.threes(1,4,5,5,7));
    }

    @Test
    public void score_the_sum_all_fours_when_fours() {
        assertEquals(12, Yatzy.fours(4,4,4,5,5));
        assertEquals(8, Yatzy.fours(4,4,5,5,5));
        assertEquals(0, Yatzy.fours(1,5,5,5,5));
    }

    @Test
    public void score_the_sum_all_fives_when_fives() {
        assertEquals(10, Yatzy.fives(4,4,4,5,5));
        assertEquals(15, Yatzy.fives(4,4,5,5,5));
        assertEquals(0, Yatzy.fives(4,1,2,4,1));
    }

    @Test
    public void score_the_sum_all_sixes_when_sixes() {
        assertEquals(6, Yatzy.sixes(4,4,6,5,5));
        assertEquals(18, Yatzy.sixes(6,5,6,6,5));
        assertEquals(0, Yatzy.sixes(4,4,4,5,5));
    }

    @Test
    public void score_the_two_higher_matching_dices_when_pair() {
        assertEquals(6, Yatzy.pair(3,4,3,5,6));
        assertEquals(10, Yatzy.pair(5,3,3,3,5));
        assertEquals(12, Yatzy.pair(5,3,6,6,5));
    }

    @Test
    public void score_the_two_higher_matching_dice_pairs_when_two_pairs() {
        assertEquals(16, Yatzy.twoPair(3,3,5,4,5));
        assertEquals(16, Yatzy.twoPair(3,3,5,5,5));
    }

    @Test
    public void score_the_three_higher_matching_dices_when_threes() {
        assertEquals(9, Yatzy.threeOfAKind(3,3,3,4,5));
        assertEquals(15, Yatzy.threeOfAKind(5,3,5,4,5));
        assertEquals(9, Yatzy.threeOfAKind(3,3,3,3,5));
    }

    @Test
    public void score_the_four_higher_matching_dices_when_fours() {
        assertEquals(12, Yatzy.fourOfAKind(3,3,3,3,5));
        assertEquals(20, Yatzy.fourOfAKind(5,5,5,4,5));
        assertEquals(9, Yatzy.threeOfAKind(3,3,3,3,3));
    }

    @Test
    public void score_the_sum_of_all_dices_when_small_straight() {
        assertEquals(15, Yatzy.smallStraight(1,2,3,4,5));
        assertEquals(15, Yatzy.smallStraight(2,3,4,5,1));
        assertEquals(0, Yatzy.smallStraight(1,2,2,4,5));
    }

    @Test
    public void score_the_sum_of_all_dices_when_large_straight() {
        assertEquals(20, Yatzy.largeStraight(6,2,3,4,5));
        assertEquals(20, Yatzy.largeStraight(2,3,4,5,6));
        assertEquals(0, Yatzy.largeStraight(1,2,2,4,5));
    }

    @Test
    public void score_the_sum_of_all_dices_when_full_house() {
        assertEquals(18, Yatzy.fullHouse(6,2,2,2,6));
        assertEquals(0, Yatzy.fullHouse(2,3,4,5,6));
    }
}
