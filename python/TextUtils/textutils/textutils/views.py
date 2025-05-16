
from django.http import HttpResponse
from django.shortcuts import render
def index(request):
    return render(request,'index.html')

def funcrempvepunc(text):
    analyzedtext = ''
    punclist = '''!@#$%^&*()_+-={}|[]\:"';?><,./~`'''
    for char in text:
        if not char in punclist:
            analyzedtext = analyzedtext + char

    return (analyzedtext)


def funcremovespace(text):
    analyzedtext = ''
    for index, char in enumerate(text):
        if index == len(text) - 1:
            break
        if not (text[index] == ' ' and text[index + 1] == ' '):
            analyzedtext = analyzedtext + char
    analyzedtext += text[len(text) - 1]

    return (analyzedtext)

def analyze(request):
    text = request.POST.get('text')
    removeP = request.POST.get('removepunc','off')
    extraspace = request.POST.get('extraspace','off')
    if removeP=='on' and extraspace=='on':
        txt=funcrempvepunc(text)
        ans=funcremovespace(txt)
        param = {"txt": ans}
        return render(request, 'analyze.html', param)
    elif removeP=='on':
        param ={"txt":funcrempvepunc(text)}
        return render(request,'analyze.html',param)
    elif extraspace=='on':
        param = {"txt": funcremovespace(text)}
        return render(request, 'analyze.html', param)
    else:
        param={'txt':'NO Operation Performed'}
        return render(request,'analyze.html',param)