import { StatusBar } from 'expo-status-bar';
import { useState } from 'react';
import { StyleSheet, Text, View, FlatList, TouchableOpacity} from 'react-native';

export default function App() {
  const [people, setPeople] = useState([
    { name: 'name01', id:'1'},
    { name: 'name02', id:'2'},
    { name: 'name03', id:'3'},
    { name: 'name04', id:'4'},
    { name: 'name05', id:'5'},
    { name: 'name06', id:'6'},
    { name: 'name07', id:'7'},
  ]);

  const pressHandler = (id) => {
    console.log(id);
    setPeople((prevPeople) => {
      return prevPeople.filter(person => person.id != id)
    })
  }
  
  return (
    <View style={styles.container}>
      <Text style={styles.titulo}>React Native Tutorial dor Beginners - #8!</Text>
     
      <FlatList
        numColumns={2}
        keyExtractor={(item) => item.id}
        data={people}
        renderItem={({ item }) => (
          <TouchableOpacity onPress={() => pressHandler(item.id)}>
            <Text style={styles.item}>{item.name}</Text>
          </TouchableOpacity>
        )}
      />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    justifyContent: 'center',
  },
  titulo: {
    color: 'white',
    backgroundColor: 'gray',
    margin: 'auto',
    fontSize: 35,
  },
  item: {
    backgroundColor: 'red',
    color: 'white',
    padding: 15,
    margin: 15,
  },
});
