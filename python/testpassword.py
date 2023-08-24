import re

def validar_senha(senha):
    # Verifica se a senha tem pelo menos 5 caracteres 
    if len(senha) < 5:
        return False
    
    # Verifica se a senha contém pelo menos um caractere especial
    if not re.search(r'[!@#$%^&*(),.?":{}|<>]', senha):
        return False
    
    # Verifica se a senha contém pelo menos um número
    if not re.search(r'\d', senha):
        return False
    
    # Verifica se a senha contém pelo menos uma letra maiúscula e uma minúscula
    if not re.search(r'[a-z]', senha) or not re.search(r'[A-Z]', senha):
        return False
    
    return True

# Teste
senha = input("Digite a senha: ")
if validar_senha(senha):
    print("Senha válida")
else:
    print("Senha inválida")
