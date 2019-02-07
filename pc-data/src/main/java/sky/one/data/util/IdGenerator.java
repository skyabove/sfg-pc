package sky.one.data.util;

import java.util.Collections;
import java.util.Set;
import org.springframework.stereotype.Component;

@Component
public class IdGenerator {

  public Integer generateNextIntId(Set<Integer> integerSet) {
    return integerSet == null || integerSet.isEmpty() ? 1 : Collections.max(integerSet) + 1;
  }

}
