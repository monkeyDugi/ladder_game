package ladder.creator;

import core.NaturalNumber;
import junit.framework.TestCase;
import ladder.Position;

public class RandomLadderCreatorTest extends TestCase {

  public void testGenerateStartPositions() {
    ManualLadderCreator manualLadderCreator = new ManualLadderCreator(new NaturalNumber(3), new NaturalNumber(4));
    RandomLadderCreator creator = new RandomLadderCreator(manualLadderCreator);
    Position[] positions = creator.generateStartPositions();
    for (int i = 0; i < positions.length; i++) {
      System.out.println(String.format("position : %s", positions[i]));
    }
  }

  public void testIsExisted() {
    NaturalNumber[] startPositions = {new NaturalNumber(2), new NaturalNumber(3)};
    assertTrue(RandomLadderCreator.isExisted(startPositions, new NaturalNumber(2)));
    assertFalse(RandomLadderCreator.isExisted(startPositions, new NaturalNumber(4)));
  }
}
