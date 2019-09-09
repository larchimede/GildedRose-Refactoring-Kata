# Characterized tests: Test update quality / sell-in from 1 to 27 days:
- "foo", sell-in: 10, quality: 20
- "Aged Brie": quality: sell-in: 2, quality: 0
- "Elixir of the Mongoose", sell-in: 5, quality: 7
- "Sulfuras, Hand of Ragnaros", sell-in: 0, quality: 80
- "Backstage passes to a TAFKAL80ETC concert", sell-in: 15, quality: 20
- "Conjured", sell-in: 3, quality: 6

# Refactoring steps
- Extract method from update quality loop
- Idiomatic code (using approved refactoring and ide) : foreach, += ...
- Move updateQuality behaviour into an item wrapper (feature envy smell)
- remove duplication (increaseQuality, decreaseQuality)
- group similar tasks (quality update vs sellin update)
    - Use compose method pattern    
- Simplify conditional 
    - lift-up conditional refactoring
- add new feature on conjured items (having just added a test before)
- Replace conditional logic to strategy pattern (polymorphism)