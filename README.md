## Use Case 7: Add-On Service Selection

### Goal

Extend the booking model to support optional services, demonstrating how real-world business features can be added without modifying core booking or allocation logic.

---

### Actor

* **Guest** – selects optional services for an existing reservation
* **Add-On Service** – represents an individual optional offering
* **Add-On Service Manager** – manages the association between reservations and selected services

---

### Flow

1. Guest selects one or more add-on services
2. Selected services are added to a list
3. The list of services is mapped to the corresponding reservation ID
4. Additional cost for the reservation is calculated
5. Core booking and inventory state remain unchanged

---

### Key Concepts Used

* **Business Extensibility**
  Real-world bookings often include additional offerings beyond the primary product. The system supports new features without disrupting existing logic.

* **One-to-Many Relationship**
  A single reservation can have multiple associated services.

* **Map and List Combination**
  `Map<String, List<AddOnService>>` enables efficient lookup and flexible storage of multiple services.

* **Composition over Inheritance**
  Services are composed with reservations instead of being inherited, allowing flexible system growth.

* **Separation of Core and Optional Features**
  Add-on services are handled independently of booking and allocation logic.

* **Cost Aggregation**
  Service costs are calculated separately and combined when required.

---

### Key Requirements

* Attach multiple services to a single reservation
* Store services using a reservation-to-services mapping
* Calculate total additional cost for selected services
* Ensure booking and inventory logic remain unaffected
* Allow easy addition of new service types

---

### Key Benefits

* Flexible attachment of optional services to reservations
* Clean separation between core booking and additional features
* Easy extensibility for future enhancements

---

### Drawbacks of Previous Use Case

Use Case 6 confirmed room allocation but treated bookings as static entities.
Without add-on support, the system could not model real-world booking enhancements such as additional services.

---

### Sample Execution

#### Compile

```
javac UseCase7AddOnServiceSelection.java
```

#### Run

```
java UseCase7AddOnServiceSelection
```

---

### Sample Output

```
Services for Reservation R101:
- Breakfast : ₹500
- Airport Pickup : ₹1200
- Extra Bed : ₹800
Total Add-On Cost: ₹2500
```
