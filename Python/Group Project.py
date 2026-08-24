# Myron, Raven, Phoenix
# 11/12/25
# Tsunami Evacuation System

import math
import random

def Event():
    '''Determines whether an event will happen and which one it will be'''
    if random.randrange(0, 4) == 0:
        return 'no event'
    if random.randrange(0, 4) == 1:
        return 'volcano'
    elif random.randrange(0, 4) == 2:
        return 'earthquake'
    elif random.randrange(0, 4) == 3:
        return 'landslide'

def TsunamiSpeed(type):
    '''Calculates the speed of the tsunami. Speed is modified by the type of
    event that is occurring'''
    waveLength = random.randrange()
    oceanDepth = random.randrange()
    g = 9.8
    volcanoExplosion = random.uniform(1.75, 2)
    earthquakeMagnitude = random.uniform(1.5, 1.74)
    landslideVolumeDisplacement = random.uniform(1.25, 1.49)
    if type == 'V':
        velocity = math.sqrt(g*(oceanDepth+waveLength)*volcanoExplosion)
    elif type == 'E':
        velocity = math.sqrt(g*(oceanDepth+waveLength)*earthquakeMagnitude)
    elif type == 'L':
        velocity = math.sqrt(g*(oceanDepth+waveLength)*landslideVolumeDisplacement)
    return velocity


def Location():
    distance = int(input('In meters, how far away from the shore is your current location? '))
    return distance
    
def TimeCalc(inputs):
    #inputs = velocity, distance from shore
    evacTime = inputs[1]/inputs[0]
    return evacTime
    
def main():
    inputs = []
    print(Event())
    if Event() == 'no event':
        print('No disaster occurred today.')
    elif Event() == 'volcano':
        inputs += [TsunamiSpeed('V')]
        print('A volcano has erupted and caused a tsunami. The tsunami\'s current speed is ', inputs[0] , '.', sep = '')
    elif Event() == 'earthquake':
        inputs += [TsunamiSpeed('E')]
        print('An earthquake has hit a nearby are and caused a tsunami. The tsunami\'s current speed is ', inputs[0] , '.', sep = '')
    elif Event() == 'landslide':
        inputs += [TsunamiSpeed('L')]
        print('A landslide has ran into the ocean and caused a tsunami. The tsunami\'s current speed is ', inputs[0] , '.', sep = '')
    print('Please enter the necesary information so we can determine how long you have to evacuate?')
    inputs += Location()
    if TimeCalc(inputs) > 60:
        print('The tsunami will reach your current location in ', round(TimeCalc(inputs)/60, 1), ' minutes.', sep = '')
    else:
        print('The tsunami will reach your current location in ', TimeCalc(inputs), ' seconds.', sep = '')

if __name__ == '__main__':
    main()