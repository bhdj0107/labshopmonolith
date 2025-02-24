package labshopmonolith.domain;

import labshopmonolith.domain.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "inventories",
    path = "inventories"
)
public interface InventoryRepository extends JpaRepository<Inventory, Long> {}
