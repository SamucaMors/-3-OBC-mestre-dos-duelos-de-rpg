def duelo(lutador1, lutador2):
    while lutador1["vida"] > 0 and lutador2["vida"] > 0:
        lutador2["vida"] -= lutador1["poder"]
        if(lutador2["vida"] <= 0):
            return f"{lutador1['nome']}"
        lutador1["vida"] -= lutador2["poder"]
        if lutador1["vida"] <= 0:
            return f"{lutador2['nome']}"
guerreiro = {"nome": "Thor", "classe": "Guerreiro", "vida": 100, "poder": 20}
mago = {"nome": "Gandalf", "classe": "Mago", "vida": 80, "poder": 25}
print(guerreiro)
print(mago)
print(duelo(mago, guerreiro))
