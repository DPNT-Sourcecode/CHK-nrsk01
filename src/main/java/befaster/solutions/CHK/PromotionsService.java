package befaster.solutions.CHK;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PromotionsService {

    private List<Promotion> promotions;

    public PromotionsService() {
        this.promotions = new ArrayList<>(2);
        promotions.add(new Promotion("3A", 'A', 3, 130));
        promotions.add(new Promotion("2B", 'B', 2, 45));
    }

    public Optional<Promotion> getPromotionBySKU(char sku) {
        return promotions.stream().filter(promotion -> promotion.getSku().equals(sku))
                .findFirst();
    }
}

