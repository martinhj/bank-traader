#!/bin/sh

./make.sh

if [ $? -eq 0 ]
then
echo "Kompilerte greit, kjører programmet:"
java Bank
else
echo "Kompilerte med feil, kjører ikke programmet."
fi
