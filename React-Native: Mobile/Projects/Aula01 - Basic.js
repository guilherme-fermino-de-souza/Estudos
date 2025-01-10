import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, TouchableOpacity, Image, View, SafeAreaView } from 'react-native';

export default function App() {
  const handlePress = () => {console.log("Text Pressed")}
  return (
    <SafeAreaView style={styles.container}> 
      <Text numberOfLines={1} onPress={handlePress}>Hello React Native</Text>
      <Image source={require('./assets/favicon.png')}/>
      <TouchableOpacity onPress={() => console.log("Image tapped")}>
      <Image
          blurRadius={0}
          fadeDuration={1000}
        source={{ 
          widht: 200,
          height: 300,
          uri:"https://mir-s3-cdn-cf.behance.net/project_modules/1400/5a0af5214672447.675c10503880a.jpg"}}/>
      </TouchableOpacity>
      <StatusBar style="auto" />
    </SafeAreaView>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: 'dodgerblue',
  },
});
