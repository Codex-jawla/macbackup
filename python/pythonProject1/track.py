import phonenumbers
from phonenumbers import geocoder
pn1 = phonenumbers.parse("+919319221339")
pn3 = phonenumbers.parse("+926398427376")
pn4 = phonenumbers.parse("+918010634050")

print("address")
print(geocoder.description_for_number(pn1,'en'))
print(geocoder.description_for_number(pn3,'en'))
print(geocoder.description_for_number(pn4,'en'))