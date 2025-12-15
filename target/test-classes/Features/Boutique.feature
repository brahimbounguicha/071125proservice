Feature: boutique page

Scenario: effectuer le tri et cliquer sur un produit

Given utilisateur est sur la page boutique 
When utilisateur effectue le tri1 "ASC" le tri2 "Name" et le tri3 "Accessoires"
And clique sur le produit "Mi 20W Charger (Type-C)"

Then utilisateur est derige vers la page du produit "Mi 20W Charger (Type-C)"