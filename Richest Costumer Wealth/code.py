def richest_costumer_wealth(accounts):
  max_wealth = 0
  for costumer in accounts:
    wealth = sum(costumer)
    max_wealth = max(max_wealth, wealth)
  return max_wealth