import re
from fuzzywuzzy import fuzz

# Data computer
computers = [
    {"brand": "Lenovo", "model": "B480", "disk_type": "SSD", "disk_size": 500, "RAM": 8},
    # Add more computer data here
]

def search_computer_by_brand(keyword):
    results = []
    keyword = keyword.lower()
    # Menggunakan regular expressions untuk mencocokkan variasi kata kunci brand
    pattern = re.compile(r"|".join(keyword))
    for computer in computers:
        brand = computer["brand"].lower()
        if re.search(pattern, brand):
            results.append(computer)
    return results

# Contoh penggunaan fungsi pencarian berdasarkan brand
search_results = search_computer_by_brand(["leno", "eno", "ovo"])
print(search_results)
