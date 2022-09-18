package befaster.solutions.CHK;

import befaster.solutions.CHK.model.Promotion;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class PromotionsService {

    private List<Promotion> promotions;

    public PromotionsService() {
        this.promotions = new ArrayList<>(2);
        promotions.add(new Promotion("5A", "A", 5, 200));
        promotions.add(new Promotion("3A", "A", 3, 130));
        promotions.add(new Promotion("2B", "B", 2, 45));

    }

    public List<Promotion> getPromotionBySKU(String sku) {
        return promotions.stream().filter(promotion -> promotion.getSku().equals(sku))
                .sorted(Comparator.comparing(Promotion::getQuantity))
                .collect(Collectors.toList());
    }
}


